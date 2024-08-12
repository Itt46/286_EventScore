/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventscore;

/**
 *
 * @author ittak
 */
class ScoreDisplay implements ScoreListener {
    private String name;

    public ScoreDisplay(String name) {
        this.name = name;
    }

    @Override
    public void scoreChange(ScoreEvent event) {
        System.out.println(name + " live result: " + event.getScoreLine() + " <- SaDangPhon");
    }
}
