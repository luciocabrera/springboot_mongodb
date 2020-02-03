package umd.api.metadata.TableGroup;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class TableGroupService {

    @Autowired
    private TableGroupRepository tableGroupRepository;

    public TableGroup saveOrUpdateTableGroup(TableGroup tableGroup) {
        return tableGroupRepository.save(tableGroup);
    }

    public Collection<TableGroup> findAllTableGroups() {
        return tableGroupRepository.findAll();
    }

    public Optional<TableGroup> findById(String tableGroupId) {
        return tableGroupRepository.findById(tableGroupId);
    }
}
