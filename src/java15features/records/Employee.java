package java15features.records;

// We can create sealed interfaces.
public sealed interface Employee permits Doctor, Nurse{
}
