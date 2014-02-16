package behavioral.template;

import java.util.Map;

public class TestJdbcTemplate {

	public static void main(String[] args) {
		JdbcTamplate template = new JdbcTamplate();
		Map<String,Object> data = template.executeQuery("SomeQuery");
		

	}

}
