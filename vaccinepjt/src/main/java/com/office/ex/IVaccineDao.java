package com.office.ex;

import java.util.List;

/**
 * 백신 접종 정보를 DB 에서 등록·조회·삭제하는 DAO 규격.
 */
public interface IVaccineDao extends IVaccineConfig {
	
	/** 백신 접종 정보를 등록하고 반영된 행 수를 반환한다. */
	public int insertVaccineInjection(VaccineDto vaccineDto);

	/** 등록된 모든 백신 접종 정보를 조회한다. */
	public List<VaccineDto> selectVaccineInjections();

	/** 접종 번호(fvp_no)에 해당하는 접종 정보를 삭제하고 반영된 행 수를 반환한다. */
	public int deleteVaccineInjectionByFvpNo(int fvp_no);

}
