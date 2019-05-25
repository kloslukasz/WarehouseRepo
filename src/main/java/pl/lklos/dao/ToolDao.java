package pl.lklos.dao;

import pl.lklos.model.Tool;

import java.util.List;

import java.util.List;

public interface ToolDao {
    List<Tool> getAllTools();
    void setAvailability(Long id, boolean availability, Long userId);
}