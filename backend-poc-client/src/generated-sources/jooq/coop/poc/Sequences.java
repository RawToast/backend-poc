/**
 * This class is generated by jOOQ
 */
package coop.poc;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all sequences in coopjooqpoc
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

	/**
	 * The sequence <code>coopjooqpoc.stores_store_id_seq</code>
	 */
	public static final org.jooq.Sequence<java.lang.Long> STORES_STORE_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("stores_store_id_seq", coop.poc.Coopjooqpoc.COOPJOOQPOC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}