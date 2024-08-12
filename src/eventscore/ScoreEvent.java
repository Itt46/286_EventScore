/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventscore;

/**
 *
 * @author ittak
 */
public class ScoreEvent {
    private String scoreLine;

    public ScoreEvent(String scoreLine) {
        this.scoreLine = scoreLine;
    }

    public String getScoreLine() {
        return scoreLine;
    }
}