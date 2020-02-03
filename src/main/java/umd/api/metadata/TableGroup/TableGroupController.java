package umd.api.metadata.TableGroup;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api/tableGroup")
public class TableGroupController {

    @Autowired
    private TableGroupService tableGroupService;

    @PostMapping("/add")
    public ResponseEntity<?> saveOrUpdateTableGroup(@Valid @RequestBody TableGroup tableGroup, BindingResult result) {
        TableGroup tableGroup_ = tableGroupService.saveOrUpdateTableGroup(tableGroup);
        return new ResponseEntity<>(tableGroup_, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public Collection<TableGroup> findAllTableGroups() {
        return tableGroupService.findAllTableGroups();
    }

    @GetMapping("/{tableGroupId}")
    public ResponseEntity<?> findTableGroupById(@PathVariable String tableGroupId) {
        Optional<TableGroup> tableGroup = tableGroupService.findById(tableGroupId);

        return new ResponseEntity<>(tableGroup, HttpStatus.OK);
    }

}
