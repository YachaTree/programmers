class Point:
    def __init__(self, r: int, c: int):
        self.r = r
        self.c = c

class Robot:
    def __init__(self, route: list, points: list):
        self.route = route
        self.points = points
        start = points[route[0] - 1]
        self.cur_r = start.r
        self.cur_c = start.c
        self.pointer = 0
        self.finished = False

    def move_one_step(self):
        if self.finished:
            return
        
        if self.pointer < len(self.route) - 1:
            target = self.points[self.route[self.pointer + 1] - 1]
            if self.cur_r == target.r and self.cur_c == target.c:
                self.pointer += 1
                if self.pointer == len(self.route) - 1:
                    self.finished = True
                return
            
            if self.cur_r != target.r:
                diff = target.r - self.cur_r
                self.cur_r += 1 if diff > 0 else -1
            elif self.cur_c != target.c:
                diff = target.c - self.cur_c
                self.cur_c += 1 if diff > 0 else -1
            
            if self.cur_r == target.r and self.cur_c == target.c:
                self.pointer += 1
                if self.pointer == len(self.route) - 1:
                    self.finished = True

    def get_position_key(self):
        return (self.cur_r, self.cur_c)

def solution(points, routes):
    points_obj = [Point(r, c) for r, c in points]
    
    robots = [Robot(route, points_obj) for route in routes]
    
    collision_count = 0

    pos_count = {}
    for robot in robots:
        key = robot.get_position_key()
        pos_count[key] = pos_count.get(key, 0) + 1
    for count in pos_count.values():
        if count >= 2:
            collision_count += 1

    while robots:
        for robot in robots:
            robot.move_one_step()
        
        pos_count = {}
        for robot in robots:
            key = robot.get_position_key()
            pos_count[key] = pos_count.get(key, 0) + 1
        for count in pos_count.values():
            if count >= 2:
                collision_count += 1
        
        robots = [robot for robot in robots if not robot.finished]
    
    return collision_count
