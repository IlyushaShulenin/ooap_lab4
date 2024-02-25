package ru.shulenin.pattern;

import ru.shulenin.unit.Unit;
import ru.shulenin.unit.UnitType;

public interface UnitFabric {
    public Unit getUnit(UnitType unitType);
}
