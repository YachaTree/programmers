SELECT
    it.ITEM_ID,
    it.ITEM_NAME,
    it.RARITY
FROM
    ITEM_INFO it
JOIN
    ITEM_TREE tree ON it.ITEM_ID = tree.ITEM_ID
WHERE
    tree.PARENT_ITEM_ID IN (
        SELECT
            ITEM_ID
        FROM
            ITEM_INFO
        WHERE
            RARITY = 'RARE'
    )
ORDER BY
    it.ITEM_ID DESC;
