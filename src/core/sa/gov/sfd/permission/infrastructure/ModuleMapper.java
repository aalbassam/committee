package sa.gov.sfd.permission.infrastructure;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ModuleMapper /*implements RowMapper<ModuleEntity>*/ {

    /*@Override
    public ModuleEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        ModuleEntity module = new ModuleEntity();
        module.setModuleId(new ModuleId(rs.getLong("MODULE_ID")));
        module.setModuleInfo(new ModuleInfo(new ModuleName(rs.getString("MODULE_ENGLISH_NAME"), rs.getString("MODULE_ARABIC_NAME")), new ModuleIcon(rs.getString("MODULE_ICON_AWESOME")), new ModuleLink(rs.getString("MODULE_LINK"))));
        return module;
    }*/

}