/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author kienb
 */
public class DayDTO {
    private int week;
    private String content;
    private List<SessionDTO> list;

    public DayDTO() {
    }

    public DayDTO(int week, String content, List<SessionDTO> list) {
        this.week = week;
        this.content = content;
        this.list = list;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<SessionDTO> getList() {
        return list;
    }

    public void setList(List<SessionDTO> list) {
        this.list = list;
    }

    public boolean isSelected(LocalDate date) {
        for(SessionDTO i : list){
            if(i.getDate().isEqual(date)){
                return true;
            }
        }
        return false;
    }

    
}
