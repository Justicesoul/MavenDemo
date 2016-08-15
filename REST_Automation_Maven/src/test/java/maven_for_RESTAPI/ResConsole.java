package maven_for_RESTAPI;

import initialize.Configs;
import ultilities.Functions_REST;

public class ResConsole extends Functions_REST{
	public static void GET() throws Exception{
		GET_Function("http://stg-api.ziniopro.com/console/v1/applications");
//		GET_Function("/console/v1/application_builds?sort=-remote_identifier");
//		GET_Function_MultipleAPI(ListAPIonFile(Configs.TestCaseFile_path, Configs.start_row, Configs.start_column, Configs.end_row));
	}

	public static void POST(){
		POST_Function(path);
		GET_Function(path);
	}

}
