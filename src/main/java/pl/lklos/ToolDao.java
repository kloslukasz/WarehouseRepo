package pl.lklos;

import java.util.List;

public interface ToolDao {

    List<Tool> getAllTools();
    void setAvailability(Long id, boolean availability);
//    Tool add(Tool tool);


}
