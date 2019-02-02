package com.hotelserver.model.firstresponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
@JsonInclude(Include.NON_NULL)
public class RoomDescription
{
	@JsonProperty("Text")
	private String Text;

	@JsonProperty("Image")
    private String[] Image;


//    @Override
//    public String toString()
//    {
//        return "ClassPojo [Text = "+Text+", Image = "+Image+"]";
//    }
}