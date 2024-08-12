/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventscore;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ittak
 */
class ScoreSource {
    private List<ScoreListener> listeners = new ArrayList<>();

    public void addScoreListener(ScoreListener listener) {
        listeners.add(listener);
    }

    public void removeScoreListener(ScoreListener listener) {
        listeners.remove(listener);
    }

    public void setScoreLine(String scoreLine) {
        ScoreEvent event = new ScoreEvent(scoreLine);
        notifyScoreListeners(event);
    }

    private void notifyScoreListeners(ScoreEvent event) {
        for (ScoreListener listener : listeners) {
            listener.scoreChange(event);
        }
    }
}
