/**
 * Интерфейс, предназначенный для реализации методов пещер и похожих на них локаций
 */
public interface Cavernous {

    /** описывает то, как идет пещера (прямо или криво) */
    Hole goStraight();

    /** Реализует спуск пещеры (резкий или плавный) */
    Hole breakOff();
}
