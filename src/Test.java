import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql;
		//创建String容器
		ApplicationContext ac=new ClassPathXmlApplicationContext("jdbcTemplateBean.xml");
		//获取jdbcTemplate实力
		JdbcTemplate template=(JdbcTemplate) ac.getBean("jdbcTemplate");
		sql="select * from imooc_goddess";
		//查询操作返回结果集
		List list=(List)template.queryForList(sql);
		//循环打印结果集
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i).toString());
		
		
				
				
				
				
				
		
	}

}
