package com.masai.Service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.masai.module.ModernTech;
import com.masai.repository.Modern_Tech_Repo;


@Service
public class Modern_Tech_Service implements Modern_Tech_Interface {
	
	@Autowired
	private Modern_Tech_Repo mt;
	
	@Override
	public ModernTech addTech(ModernTech tech) {
		return mt.save(tech);
	}

	@Override
	public ModernTech getTechList(Integer id) {
		Optional<ModernTech> list = mt.findById(id);
		if(list.isPresent()) {
			return list.get();
		}
		return null;
	}
}