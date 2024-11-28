package at.zims2k.visitor;

import at.zims2k.visitor.game.units.Archer;
import at.zims2k.visitor.game.units.Cavalry;
import at.zims2k.visitor.game.units.Spearman;
import at.zims2k.visitor.game.units.Unit;
import at.zims2k.visitor.game.actions.AttackAction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Unit> units = new ArrayList<>();
        units.add(new Archer("SuperBow"));
        units.add(new Cavalry("Mike"));
        units.add(new Spearman("Steel"));

        units.forEach(unit -> {
            unit.accept(new AttackAction());
        });
    }
}
