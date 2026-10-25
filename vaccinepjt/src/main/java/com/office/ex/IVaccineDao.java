package com.office.ex;

import java.util.List;

public interface IVaccineDao extends IVaccineConfig {
	
	public int insertVaccineInjection(VaccineDto vaccineDto);

	public List<VaccineDto> selectVaccineInjections();

	public int deleteVaccineInjectionByFvpNo(int fvp_no);

}
