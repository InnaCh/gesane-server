/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.rafaelaznar.dao.specificimplementation;

import eu.rafaelaznar.bean.helper.MetaBeanHelper;
import eu.rafaelaznar.dao.genericimplementation.TableGenericDaoImplementation;
import java.sql.Connection;

/**
 *
 * @author a0y3770325h
 */
public class PacienteVisitanteSpecificDaoImplementation extends TableGenericDaoImplementation {

    public PacienteVisitanteSpecificDaoImplementation(Connection oPooledConnection, MetaBeanHelper oPuserBean_security, String strWhere) throws Exception {
        super("paciente", oPooledConnection, oPuserBean_security, strWhere);

        strSQL = " SELECT * FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME ='paciente' AND COLUMN_NAME NOT IN ('id_usuario')";

    }
}
