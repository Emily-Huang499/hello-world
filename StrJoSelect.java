package firstc;

import java.util.StringJoiner;

public class StrJoSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fields = {"name", "position", "salary"};
		String table = "employee";
		String select = buildSelectSql(table, fields);
		System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "测试成功" : "测试失败");
	}
	static String buildSelectSql(String table, String[] fields) {
		var sj = new StringJoiner(", ", "SELECT ", " FROM "+ table);
		for (String field : fields) {
			sj.add(field);
		}
		return sj.toString();
	}

}
