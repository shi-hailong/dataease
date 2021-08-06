package io.dataease.base.mapper.ext;

import io.dataease.base.domain.DatasetTableField;
import io.dataease.dto.PanelViewLinkageDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExtPanelViewLinkageMapper {

    List<PanelViewLinkageDTO> getViewLinkageGather(@Param("panelId") String panelId,@Param("sourceViewId") String sourceViewId,@Param("targetViewIds") List<String> targetViewIds);
    List<DatasetTableField> queryTableField(@Param("tableId") String tableId);

}