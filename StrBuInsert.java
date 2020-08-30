package firstc;

public class StrBuInsert {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fields = {"name", "position", "salary"};
		String table = "employee";
		String insert = buildInsertSql(table,fields);
		System.out.println(insert);
		String s = "INSERT INTO employee (name, position, salary) VALUES (?,?,?)";
		System.out.println(s.equals(insert) ? "测试成功" : "测试失败");
		}
	static String buildInsertSql(String table,String[] fields) {
		 int n = fields.length;        
		 var sc = new StringBuilder(1024);      
		 for (int i = 0;i < n-1;i ++){
			 sc.append(fields[i])
			   .append(", ");  
			 }       
		 sc.append(fields[n-1]);        
		 String sa  = sc.toString();        
		 System.out.println(sa);       
		 var s = new StringBuilder(1024);       
		 s.append("INSERT INTO ")
		  .append(table).append(" (")
		  .append(sa)
		  .append(") VALUES (?, ?, ?)");       
		 String sb = s.toString();       
		 return sb;  
	}
}
