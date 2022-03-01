package week3.les6.practicum_6A;

import java.util.ArrayList;

public class Persoon{
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames = new ArrayList<Game>();

    public Persoon(String nm, double bud) {
        this.naam = nm;
        this.budget = bud;
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g) {
        if (getBudget() >= g.huidigeWaarde() && !mijnGames.contains(g)) {
            mijnGames.add(g);
            budget -= g.huidigeWaarde();
            return true;
        }
        else {
            return false;
        }
    }

    public boolean verkoop(Game g, Persoon koper) {
        if (mijnGames.contains(g)) {
            if (!koper.mijnGames.contains(g) && koper.getBudget() >= g.huidigeWaarde()) {
                mijnGames.remove(g);
                koper.mijnGames.add(g);
                koper.budget -= g.huidigeWaarde();
                budget += g.huidigeWaarde();
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public String toString() {  //p1: Eric heeft een budget van €132,82 en bezit de volgende games:
                                //Just Cause 3, uitgegeven in 2019; nieuwprijs: €49,98 nu voor: €34,99
                                //Need for Speed: Rivals, uitgegeven in 2019; nieuwprijs: €45,99 nu voor: €32,19
        String out = "";
        out += String.format("%s heeft een budget van €%.2f en bezit de volgende games:", naam, budget);
        for (Game g : mijnGames) {
            out += "\n" + g;
        }
        out = out.replace(".", ",");
        return out;
    }
}
