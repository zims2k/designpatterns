package at.zims2k.visitor.game.actions;

import at.zims2k.visitor.game.units.Archer;
import at.zims2k.visitor.game.units.Cavalry;
import at.zims2k.visitor.game.units.Spearman;

public class MoveAction implements UnitAction {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    @Override
    public void visitArcher(Archer archer) {

    }

    @Override
    public void visitCavalry(Cavalry cavalry) {

    }

    @Override
    public void visitSpearman(Spearman spearman) {

    }
}
