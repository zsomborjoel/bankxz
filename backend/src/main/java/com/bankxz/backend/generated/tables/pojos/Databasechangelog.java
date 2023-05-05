/*
 * This file is generated by jOOQ.
 */
package com.bankxz.backend.generated.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Databasechangelog implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String author;
    private String filename;
    private LocalDateTime dateexecuted;
    private Integer orderexecuted;
    private String exectype;
    private String md5sum;
    private String description;
    private String comments;
    private String tag;
    private String liquibase;
    private String contexts;
    private String labels;
    private String deploymentId;

    public Databasechangelog() {}

    public Databasechangelog(Databasechangelog value) {
        this.id = value.id;
        this.author = value.author;
        this.filename = value.filename;
        this.dateexecuted = value.dateexecuted;
        this.orderexecuted = value.orderexecuted;
        this.exectype = value.exectype;
        this.md5sum = value.md5sum;
        this.description = value.description;
        this.comments = value.comments;
        this.tag = value.tag;
        this.liquibase = value.liquibase;
        this.contexts = value.contexts;
        this.labels = value.labels;
        this.deploymentId = value.deploymentId;
    }

    public Databasechangelog(
        String id,
        String author,
        String filename,
        LocalDateTime dateexecuted,
        Integer orderexecuted,
        String exectype,
        String md5sum,
        String description,
        String comments,
        String tag,
        String liquibase,
        String contexts,
        String labels,
        String deploymentId
    ) {
        this.id = id;
        this.author = author;
        this.filename = filename;
        this.dateexecuted = dateexecuted;
        this.orderexecuted = orderexecuted;
        this.exectype = exectype;
        this.md5sum = md5sum;
        this.description = description;
        this.comments = comments;
        this.tag = tag;
        this.liquibase = liquibase;
        this.contexts = contexts;
        this.labels = labels;
        this.deploymentId = deploymentId;
    }

    /**
     * Getter for <code>public.databasechangelog.id</code>.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter for <code>public.databasechangelog.id</code>.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for <code>public.databasechangelog.author</code>.
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * Setter for <code>public.databasechangelog.author</code>.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Getter for <code>public.databasechangelog.filename</code>.
     */
    public String getFilename() {
        return this.filename;
    }

    /**
     * Setter for <code>public.databasechangelog.filename</code>.
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * Getter for <code>public.databasechangelog.dateexecuted</code>.
     */
    public LocalDateTime getDateexecuted() {
        return this.dateexecuted;
    }

    /**
     * Setter for <code>public.databasechangelog.dateexecuted</code>.
     */
    public void setDateexecuted(LocalDateTime dateexecuted) {
        this.dateexecuted = dateexecuted;
    }

    /**
     * Getter for <code>public.databasechangelog.orderexecuted</code>.
     */
    public Integer getOrderexecuted() {
        return this.orderexecuted;
    }

    /**
     * Setter for <code>public.databasechangelog.orderexecuted</code>.
     */
    public void setOrderexecuted(Integer orderexecuted) {
        this.orderexecuted = orderexecuted;
    }

    /**
     * Getter for <code>public.databasechangelog.exectype</code>.
     */
    public String getExectype() {
        return this.exectype;
    }

    /**
     * Setter for <code>public.databasechangelog.exectype</code>.
     */
    public void setExectype(String exectype) {
        this.exectype = exectype;
    }

    /**
     * Getter for <code>public.databasechangelog.md5sum</code>.
     */
    public String getMd5sum() {
        return this.md5sum;
    }

    /**
     * Setter for <code>public.databasechangelog.md5sum</code>.
     */
    public void setMd5sum(String md5sum) {
        this.md5sum = md5sum;
    }

    /**
     * Getter for <code>public.databasechangelog.description</code>.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>public.databasechangelog.description</code>.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for <code>public.databasechangelog.comments</code>.
     */
    public String getComments() {
        return this.comments;
    }

    /**
     * Setter for <code>public.databasechangelog.comments</code>.
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * Getter for <code>public.databasechangelog.tag</code>.
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * Setter for <code>public.databasechangelog.tag</code>.
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * Getter for <code>public.databasechangelog.liquibase</code>.
     */
    public String getLiquibase() {
        return this.liquibase;
    }

    /**
     * Setter for <code>public.databasechangelog.liquibase</code>.
     */
    public void setLiquibase(String liquibase) {
        this.liquibase = liquibase;
    }

    /**
     * Getter for <code>public.databasechangelog.contexts</code>.
     */
    public String getContexts() {
        return this.contexts;
    }

    /**
     * Setter for <code>public.databasechangelog.contexts</code>.
     */
    public void setContexts(String contexts) {
        this.contexts = contexts;
    }

    /**
     * Getter for <code>public.databasechangelog.labels</code>.
     */
    public String getLabels() {
        return this.labels;
    }

    /**
     * Setter for <code>public.databasechangelog.labels</code>.
     */
    public void setLabels(String labels) {
        this.labels = labels;
    }

    /**
     * Getter for <code>public.databasechangelog.deployment_id</code>.
     */
    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * Setter for <code>public.databasechangelog.deployment_id</code>.
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Databasechangelog other = (Databasechangelog) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.author == null) {
            if (other.author != null)
                return false;
        }
        else if (!this.author.equals(other.author))
            return false;
        if (this.filename == null) {
            if (other.filename != null)
                return false;
        }
        else if (!this.filename.equals(other.filename))
            return false;
        if (this.dateexecuted == null) {
            if (other.dateexecuted != null)
                return false;
        }
        else if (!this.dateexecuted.equals(other.dateexecuted))
            return false;
        if (this.orderexecuted == null) {
            if (other.orderexecuted != null)
                return false;
        }
        else if (!this.orderexecuted.equals(other.orderexecuted))
            return false;
        if (this.exectype == null) {
            if (other.exectype != null)
                return false;
        }
        else if (!this.exectype.equals(other.exectype))
            return false;
        if (this.md5sum == null) {
            if (other.md5sum != null)
                return false;
        }
        else if (!this.md5sum.equals(other.md5sum))
            return false;
        if (this.description == null) {
            if (other.description != null)
                return false;
        }
        else if (!this.description.equals(other.description))
            return false;
        if (this.comments == null) {
            if (other.comments != null)
                return false;
        }
        else if (!this.comments.equals(other.comments))
            return false;
        if (this.tag == null) {
            if (other.tag != null)
                return false;
        }
        else if (!this.tag.equals(other.tag))
            return false;
        if (this.liquibase == null) {
            if (other.liquibase != null)
                return false;
        }
        else if (!this.liquibase.equals(other.liquibase))
            return false;
        if (this.contexts == null) {
            if (other.contexts != null)
                return false;
        }
        else if (!this.contexts.equals(other.contexts))
            return false;
        if (this.labels == null) {
            if (other.labels != null)
                return false;
        }
        else if (!this.labels.equals(other.labels))
            return false;
        if (this.deploymentId == null) {
            if (other.deploymentId != null)
                return false;
        }
        else if (!this.deploymentId.equals(other.deploymentId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.author == null) ? 0 : this.author.hashCode());
        result = prime * result + ((this.filename == null) ? 0 : this.filename.hashCode());
        result = prime * result + ((this.dateexecuted == null) ? 0 : this.dateexecuted.hashCode());
        result = prime * result + ((this.orderexecuted == null) ? 0 : this.orderexecuted.hashCode());
        result = prime * result + ((this.exectype == null) ? 0 : this.exectype.hashCode());
        result = prime * result + ((this.md5sum == null) ? 0 : this.md5sum.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        result = prime * result + ((this.comments == null) ? 0 : this.comments.hashCode());
        result = prime * result + ((this.tag == null) ? 0 : this.tag.hashCode());
        result = prime * result + ((this.liquibase == null) ? 0 : this.liquibase.hashCode());
        result = prime * result + ((this.contexts == null) ? 0 : this.contexts.hashCode());
        result = prime * result + ((this.labels == null) ? 0 : this.labels.hashCode());
        result = prime * result + ((this.deploymentId == null) ? 0 : this.deploymentId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Databasechangelog (");

        sb.append(id);
        sb.append(", ").append(author);
        sb.append(", ").append(filename);
        sb.append(", ").append(dateexecuted);
        sb.append(", ").append(orderexecuted);
        sb.append(", ").append(exectype);
        sb.append(", ").append(md5sum);
        sb.append(", ").append(description);
        sb.append(", ").append(comments);
        sb.append(", ").append(tag);
        sb.append(", ").append(liquibase);
        sb.append(", ").append(contexts);
        sb.append(", ").append(labels);
        sb.append(", ").append(deploymentId);

        sb.append(")");
        return sb.toString();
    }
}
