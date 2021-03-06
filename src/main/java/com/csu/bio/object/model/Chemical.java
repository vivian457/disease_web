package com.csu.bio.object.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * for the Chemical Associations
 * 
 * @author kayzhao
 * 
 */

@Document(collection = "chemical")
public class Chemical {
	@Id
	private String id;

	@TextIndexed
	@Field("disease")
	private String disease_id;

	@TextIndexed
	@Field("umls_cui")
	private String umls_cui;

	@Field("pubmed")
	private List<String> pubmed;

	@Field("inference_score")
	private double inference_score;

	@Field("direct_evidence")
	private List<String> direct_evidence;

	@Field("omim")
	private List<String> omim_ids;

	@TextIndexed
	@Field("inference_gene_symbol")
	private String inference_gene_symbol;

	@TextIndexed
	@Field("chemical_id")
	private String chemical_id;

	@Field("casrn")
	private String casrn;

	@Field("source")
	private String source;

	private String data_type;

	public String getData_type() {
		return data_type;
	}

	public void setData_type(String data_type) {
		this.data_type = data_type;
	}

	public String getCasrn() {
		return casrn;
	}

	public void setCasrn(String casrn) {
		this.casrn = casrn;
	}

	public List<String> getDirect_evidence() {
		return direct_evidence;
	}

	public void setDirect_evidence(List<String> direct_evidence) {
		this.direct_evidence = direct_evidence;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDisease_id() {
		return disease_id;
	}

	public void setDisease_id(String disease_id) {
		this.disease_id = disease_id;
	}

	public List<String> getPubmed() {
		return pubmed;
	}

	public void setPubmed(List<String> pubmed) {
		this.pubmed = pubmed;
	}

	public double getInference_score() {
		return inference_score;
	}

	public void setInference_score(double inference_score) {
		this.inference_score = inference_score;
	}

	public List<String> getOmim_ids() {
		return omim_ids;
	}

	public void setOmim_ids(List<String> omim_ids) {
		this.omim_ids = omim_ids;
	}

	public String getInference_gene_symbol() {
		return inference_gene_symbol;
	}

	public void setInference_gene_symbol(String inference_gene_symbol) {
		this.inference_gene_symbol = inference_gene_symbol;
	}

	public String getChemical_id() {
		return chemical_id;
	}

	public void setChemical_id(String chemical_id) {
		this.chemical_id = chemical_id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getUmls_cui() {
		return umls_cui;
	}

	public void setUmls_cui(String umls_cui) {
		this.umls_cui = umls_cui;
	}
}
