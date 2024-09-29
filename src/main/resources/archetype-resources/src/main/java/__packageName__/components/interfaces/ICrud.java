package ${package}.${packageName.replace('/','.')}.components.interfaces;


/**
 * ICrud
 * <p>
 * ICrud interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BACSYSTEM APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author cbaciliod
 * @author dbacilio88@outllok.es
 * @since 25/09/2024
 */

public interface ICrud<E, I> extends IFindAll<E>, IFindById<E, I>, ISave<E>, IUpdate<E>, IDelete<I> {
}
