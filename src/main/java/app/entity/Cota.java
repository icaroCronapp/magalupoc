
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela COTA
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"COTA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Cota")
@CronappTable(role=CronappTableRole.CLASS)
public class Cota implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Id", defaultValue = "UUID.randomUUID().toString().toUpperCase()")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Nome")
    @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private User user;


    /**
    * @generated
    */
    @CronappColumn(attributeType="BOOLEAN", label="Esta Apta")
    @Column(name = "estaApta", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean estaApta;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_filial", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Filial filial;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_lance", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Lance lance;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_grupo", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Grupo grupo;


    /**
    * Construtor
    * @generated
    */
    public Cota(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Cota setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    public java.lang.String getNome() {
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public Cota setNome(java.lang.String nome) {
        this.nome = nome;
        return this;
    }
    /**
    * Obtém user
    * return user
    * @generated
    */
    public User getUser() {
        return this.user;
    }

    /**
    * Define user
    * @param user user
    * @generated
    */
    public Cota setUser(User user) {
        this.user = user;
        return this;
    }
    /**
    * Obtém estaApta
    * return estaApta
    * @generated
    */
    public java.lang.Boolean getEstaApta() {
        return this.estaApta;
    }

    /**
    * Define estaApta
    * @param estaApta estaApta
    * @generated
    */
    public Cota setEstaApta(java.lang.Boolean estaApta) {
        this.estaApta = estaApta;
        return this;
    }
    /**
    * Obtém filial
    * return filial
    * @generated
    */
    public Filial getFilial() {
        return this.filial;
    }

    /**
    * Define filial
    * @param filial filial
    * @generated
    */
    public Cota setFilial(Filial filial) {
        this.filial = filial;
        return this;
    }
    /**
    * Obtém lance
    * return lance
    * @generated
    */
    public Lance getLance() {
        return this.lance;
    }

    /**
    * Define lance
    * @param lance lance
    * @generated
    */
    public Cota setLance(Lance lance) {
        this.lance = lance;
        return this;
    }
    /**
    * Obtém grupo
    * return grupo
    * @generated
    */
    public Grupo getGrupo() {
        return this.grupo;
    }

    /**
    * Define grupo
    * @param grupo grupo
    * @generated
    */
    public Cota setGrupo(Grupo grupo) {
        this.grupo = grupo;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Cota object = (Cota)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}