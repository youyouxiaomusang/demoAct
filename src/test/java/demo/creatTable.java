package demo;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.ProcessEngines;
import org.junit.Test;

public class creatTable {

	@Test
	public void createTable(){
		ProcessEngineConfiguration createStandaloneInMemProcessEngineConfiguration = ProcessEngineConfiguration.createStandaloneInMemProcessEngineConfiguration();
		createStandaloneInMemProcessEngineConfiguration.setJdbcDriver("com.mysql.jdbc.Driver");
		createStandaloneInMemProcessEngineConfiguration.setJdbcUrl("jdbc:mysql://localhost:3306/activiti?rewriteBatchedStatements=true&useUnicode=true&characterEncoding=utf8");
		createStandaloneInMemProcessEngineConfiguration.setJdbcUsername("root");
		createStandaloneInMemProcessEngineConfiguration.setJdbcPassword("123456");
		createStandaloneInMemProcessEngineConfiguration.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
		ProcessEngine buildProcessEngine = createStandaloneInMemProcessEngineConfiguration.buildProcessEngine();
	}
}
