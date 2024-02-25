package ru.shulenin.pattern;

import ru.shulenin.unit.Unit;
import ru.shulenin.unit.UnitType;
import ru.shulenin.unit.goblin.GoblinWarmaster;
import ru.shulenin.unit.goblin.GoblinWarrior;

public class GoblinArmyFabric implements UnitFabric {
    @Override
    public Unit getUnit(UnitType unitType) {
        return switch (unitType) {
            case WARRIOR -> new GoblinWarrior();
            case WARMASTER -> new GoblinWarmaster();
            default -> null;
        };
    }
}
