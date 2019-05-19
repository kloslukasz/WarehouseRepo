package pl.lklos.dao;

import pl.lklos.model.Tool;

import java.util.List;

public interface ToolDao {

    List<Tool> getAllTools();
    void setAvailability(Long id, boolean availability);
//    Tool add(Tool tool);


}
