package func;


import dto.Milk;

/**
 * 工厂模型
 *
 */
public interface Factory {

    //工厂必然具有生产产品技能，统一的产品出口
    Milk getMilk();

}
