package com.ecomm.admin.setting;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ecomm.common.entity.setting.Setting;
import com.ecomm.common.entity.setting.SettingCategory;

public interface SettingRepository extends CrudRepository<Setting, String> {
	public List<Setting> findByCategory(SettingCategory category);
}
