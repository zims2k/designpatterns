package at.zims2k.visitor.game.units;

import at.zims2k.visitor.game.actions.UnitActionVisitor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Archer implements Unit {
    private final String archType;

    @Override
    public void accept(UnitActionVisitor unitActionVisitor) {
        unitActionVisitor.visitArcher(this);
    }
}
