package controllers.ubulogs.logcreator.logtypes;

import java.util.List;

import model.LogLine;
/**
 * The reset of the course with id '' has ended.
 * 
 * @author Yi Peng Ji
 *
 */
public class Course extends ReferencesLog {
	
	/**
	 * instacia única de la clase Course
	 */
	private static Course instance;

	/**
	 * Constructor privado de la clase singleton
	 */
	private Course() {
	}

	/**
	 * Devuelve la instancia singleton de Course.
	 * @return instancia singleton
	 */
	public static Course getInstance() {
		if (instance == null) {
			instance = new Course();
		}
		return instance;
	}
 
	@Override
	public void setLogReferencesAttributes(LogLine log, List<Integer> ids) {
		// La id del curso se ignora de momento

	}

}
