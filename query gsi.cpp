@Autowired
private AmazonDynamoDB amazonDynamoDB;

public List<Map<String, AttributeValue>> queryGSI(String indexName, String partitionKey, String sortKey) {
    DynamoDB dynamoDB = new DynamoDB(amazonDynamoDB);
    Table table = dynamoDB.getTable("YourTableName");
    Index index = table.getIndex(indexName);

    QuerySpec querySpec = new QuerySpec().withKeyConditionExpression("partitionKey = :v_partitionKey and sortKey = :v_sortKey")
            .withValueMap(new ValueMap().withString(":v_partitionKey", partitionKey).withString(":v_sortKey", sortKey));

    ItemCollection<QueryOutcome> items = index.query(querySpec);

    List<Map<String, AttributeValue>> results = new ArrayList<>();
    for (Item item : items) {
        results.add(item.asMap());
    }

    return results;
}
