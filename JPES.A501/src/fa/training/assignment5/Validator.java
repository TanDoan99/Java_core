package fa.training.assignment5;


public class Validator {
	public static void validateCode(String id) throws GeneralException{
		String code_course="FW\\d{3}";
		if(id.matches(code_course) == false) {
			throw new GeneralException("Vui Long Nhap Theo format FWXXX(X : 0 -9)");
		}
	}
	
	public static void validateStatus(String status) throws GeneralException{
		String status_course="^(active|in-active)$";
		if(status.matches(status_course) == false) {
			throw new GeneralException("Vui Long Nhap : active/in-active");
		}
	}

	public static void validateFlag(String flag) throws GeneralException{
		String flag_course="^(optional|mandatory|N\\/A)$";
		if(flag.matches(flag_course) == false) {
			throw new GeneralException("Vui Long Nhap : optional-mandatory-N/A");
		}
	}
}
