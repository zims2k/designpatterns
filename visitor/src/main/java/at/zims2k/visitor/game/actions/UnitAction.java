package at.zims2k.visitor.game.actions;

import at.zims2k.visitor.game.units.Archer;
import at.zims2k.visitor.game.units.Cavalry;
import at.zims2k.visitor.game.units.Spearman;

public interface UnitAction {
    void visitArcher(Archer archer);
    void visitCavalry(Cavalry cavalry);
    void visitSpearman(Spearman spearman);
}
