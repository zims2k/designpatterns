package at.zims2k.visitor.game.actions;

import at.zims2k.visitor.game.units.Archer;
import at.zims2k.visitor.game.units.Cavalry;
import at.zims2k.visitor.game.units.Spearman;
import at.zims2k.visitor.game.units.Unit;

public interface UnitAction {
    default void visitArcher(Archer archer) {
        System.out.printf("Performing action %s to archer %s%n", this, archer);
    }

    default void visitCavalry(Cavalry cavalry) {
        System.out.printf("Performing action %s to archer %s%n", this, cavalry);
    }

    default void visitSpearman(Spearman spearman) {
        System.out.printf("Performing action %s to archer %s%n", this, spearman);
    }

    default void visitUnit(Unit unit){

    }
}
