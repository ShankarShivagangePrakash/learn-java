package java15features.sealedclases;

// sealed class, provide a way to restrict which classes can be subtypes of a given class or interface.
// Sealed classes are useful for creating a fixed set of subclasses and enforcing a restricted hierarchy.
// Sealed class should specify who can extend this sealed class using permits keyword
public sealed class BMWSeries permits ThreeSeries, FiveSeries {
}
