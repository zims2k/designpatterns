package at.zims2k.visitor.game.units;

import at.zims2k.visitor.game.actions.UnitVisitor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Cavalry implements Unit {
    private final String horseName;

    @Override
    public void accept(UnitVisitor unitVIsitor) {

    }
}
