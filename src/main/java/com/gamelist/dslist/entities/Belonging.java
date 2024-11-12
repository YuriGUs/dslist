package com.gamelist.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

// Tabela do meio de 1 e 2
@Entity
@Table(name = "tb_belonging")
public class Belonging {

  @EmbeddedId
  private BelongingPK id = new BelongingPK();
  
  private Integer position;


  public Belonging() {
  }

  // quando instanciado fará referencia para game e gamelist
  public Belonging(Game game, GameList list, Integer position ) {
    id.setGame(game); // Acessado pelo BelonginPK
    id.setList(list); // Acessado pelo BelonginPK
    this.position = position;
  }

  public BelongingPK getId() {
    return id;
  }

  public void setId(BelongingPK id) {
    this.id = id;
  }

  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }


  // Comparando objetos
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Belonging other = (Belonging) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }
  
  
}
