package sa.gov.sfd.permission.infrastructure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import sa.gov.sfd.permission.core.ModuleEntity;
import sa.gov.sfd.permission.core.ModuleId;
import sa.gov.sfd.permission.core.ModuleInfo;
import sa.gov.sfd.permission.core.ModuleRepository;

@Repository
public class ModuleRepositoryImpl implements ModuleRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Override
    public List<ModuleEntity> findAllModules() {
        return jdbcTemplate.query("SELECT * FROM PER_MODULES", new ModuleMapper());
    }

    @Override
    public ModuleEntity findModuleById(ModuleId id) {
        return jdbcTemplate.queryForObject("SELECT * FROM PER_MODULES WHERE MODULE_ID = ? ", new Object[] { id.getId() }, new ModuleMapper());
    }

    @Override
    public int updateModule(ModuleId moduleId, ModuleInfo moduleInfo) {
        return jdbcTemplate.update("UPDATE PER_MODULES " + " SET MODULE_ARABIC_NAME = ? , MODULE_ENGLISH_NAME = ? , MODULE_ICON_AWESOME = ? , MODULE_LINK = ? " + " WHERE MODULE_ID = ?",
				new Object[] {moduleInfo.getModuleName().getModuleNameAr() , moduleInfo.getModuleName().getModuleNameEn() , moduleInfo.getModuleIcon().getIcon(),moduleInfo.getModuleLink().getLink() ,moduleId.getId()});
    }

    @Override
    public int insertNew(ModuleInfo moduleInfo) {
        return jdbcTemplate.update("INSERT INTO PER_MODULES (MODULE_ARABIC_NAME,MODULE_ENGLISH_NAME,MODULE_ICON_AWESOME,MODULE_LINK) " + "values(?,?,?,?)",
				new Object[] {moduleInfo.getModuleName().getModuleNameAr(),moduleInfo.getModuleName().getModuleNameEn(),moduleInfo.getModuleIcon().getIcon(), moduleInfo.getModuleLink().getLink()});
    }



}