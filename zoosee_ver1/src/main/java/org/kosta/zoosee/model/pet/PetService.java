package org.kosta.zoosee.model.pet;

import java.util.List;

import org.kosta.zoosee.model.vo.PetVO;

public interface PetService {

	public abstract void registerPet(PetVO pvo);

	public abstract PetVO petDetail(int petNo);

	public abstract List<PetVO> petList(String id);

	public abstract void petUpdateResult(PetVO vo);

	public abstract void updatePetNoImg(PetVO pvo);

	public abstract void deletePet(int petNo);

	public abstract List<PetVO> detailPetAndMemberInfo(String id);

	// 2016.07.06
	// petNo 갖고오기
	public abstract List<Integer> getPetNo(String id);
}