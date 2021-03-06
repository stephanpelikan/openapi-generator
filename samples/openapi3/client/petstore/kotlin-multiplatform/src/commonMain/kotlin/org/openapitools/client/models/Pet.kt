/**
* OpenAPI Petstore
* This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import org.openapitools.client.models.Category
import org.openapitools.client.models.Tag

import kotlinx.serialization.*
import kotlinx.serialization.internal.CommonEnumSerializer

/**
 * 
 * @param name 
 * @param photoUrls 
 * @param id 
 * @param category 
 * @param tags 
 * @param status pet status in the store
 */
@Serializable
data class Pet (
    @SerialName(value = "name") @Required val name: kotlin.String,
    @SerialName(value = "photoUrls") @Required val photoUrls: kotlin.collections.List<kotlin.String>,
    @SerialName(value = "id") val id: kotlin.Long? = null,
    @SerialName(value = "category") val category: Category? = null,
    @SerialName(value = "tags") val tags: kotlin.collections.List<Tag>? = null,
    /* pet status in the store */
    @SerialName(value = "status") val status: Pet.Status? = null
) {

    /**
    * pet status in the store
    * Values: available,pending,sold
    */
    @Serializable(with = Status.Serializer::class)
    enum class Status(val value: kotlin.String){
        available("available"),
        pending("pending"),
        sold("sold");

        object Serializer : CommonEnumSerializer<Status>("Status", values(), values().map { it.value.toString() }.toTypedArray())
    }
}

