public class TextBlocks{
    public static void main(String[] args) {
        // тройные кавычки используются для многострочного текста
        String json = """
                      {
                        "key": "value",
                        "number": 123
                      }
                      """;
        
        String sql = """
                     SELECT * FROM users
                     WHERE active = true
                     """;
        
        System.out.println(json);
        System.out.println(sql);
    }
}
