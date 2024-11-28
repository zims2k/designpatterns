package at.zims2k.visitor.game.units;

import at.zims2k.visitor.game.actions.UnitVisitor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Archer implements Unit {
    private final String archType;

    @Override
    public void accept(UnitVisitor unitVIsitor) {

    }
}
