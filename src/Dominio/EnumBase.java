package Dominio;
public enum EnumBase {
    SIMPLE,
    DOBLE,
    TRIPLE,
    CUADRUPLE,
    QUINTUPLE;

  public static EnumBase buscarBase(EnumBase base) {
    EnumBase baseSolicitada = null;
    for (EnumBase bases: EnumBase.values()) {
      if(bases.ordinal() == base.ordinal()){
        baseSolicitada = bases;
      }
    }
    return baseSolicitada;
  }
}
