package com.heredata.hos.model;

import com.heredata.hos.model.bucket.Bucket;
import com.heredata.model.WebServiceRequest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UploadPartCopyRequest extends WebServiceRequest {

    private String bucketName;

    private String key;

    private String sourceBucketName;

    private String sourceKey;

    private String uploadId;

    private int partNumber;

    private Long partSize;

    private String md5Digest;

    private Long beginIndex;

    private List<String> matchingETagConstraints = new ArrayList<String>();

    private List<String> nonmatchingEtagConstraints = new ArrayList<String>();

    private Date unmodifiedSinceConstraint;

    private Date modifiedSinceConstraint;

    /**
     * Optional version Id specifying which version of the source object to
     * copy. If not specified, the most recent version of the source object will
     * be copied.
     */
    private String sourceVersionId;

    public UploadPartCopyRequest() {
    }

    public UploadPartCopyRequest(String sourceBucketName, String sourceKey, String targetBucketName, String targetKey) {
        setBucketName(targetBucketName);
        setKey(targetKey);
        setSourceBucketName(sourceBucketName);
        setSourceKey(sourceKey);
    }

    public UploadPartCopyRequest(String sourceBucketName, String sourceKey, String targetBucketName, String targetKey,
                                 String uploadId) {
        this.bucketName = targetBucketName;
        this.key = targetKey;
        this.sourceBucketName = sourceBucketName;
        this.sourceKey = sourceKey;
        this.uploadId = uploadId;
    }

    public UploadPartCopyRequest(String sourceBucketName, String sourceKey, String targetBucketName, String targetKey,
                                 String uploadId, int partNumber, Long beginIndex, Long partSize) {
        this.bucketName = targetBucketName;
        this.key = targetKey;
        this.sourceBucketName = sourceBucketName;
        this.sourceKey = sourceKey;
        this.uploadId = uploadId;
        this.partNumber = partNumber;
        this.beginIndex = beginIndex;
        this.partSize = partSize;
    }

    /**
     * Gets the {@link Bucket} name.
     *
     * @return Bucket name.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Sets the {@link Bucket} name.
     *
     * @param bucketName
     *            Bucket name.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Gets the {@link HOSObject} key.
     *
     * @return Object key.
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the {@link HOSObject} key.
     *
     * @param key
     *            Object key。
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Gets the multipart upload Id.
     *
     * @return The multipart upload Id.
     */
    public String getUploadId() {
        return uploadId;
    }

    /**
     * Sets the multipart upload Id.
     *
     * @param uploadId
     *            The multipart upload Id.
     */
    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * Gets the part number. For every part uploading, it has a part number
     * which is in 1 to 10000 range. Given the upload Id, the part number
     * identified the part and its position in the target file. If uploading the
     * part with an existing part number, the existing part with the part number
     * would be overwritten.
     *
     * @return The part number.
     */
    public int getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the part number. For every part uploading, it has a part number
     * which is in 1 to 10000 range. Given the upload Id, the part number
     * identified the part and its position in the target file. If uploading the
     * part with an existing part number, the existing part with the part number
     * would be overwritten.
     *
     * @param partNumber
     *            The part number.
     */
    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * Gets the part's data size in bytes. The minimal size for a part is 5MB
     * except the last part.
     *
     * @return Part's data size in bytes.
     */
    public Long getPartSize() {
        return partSize;
    }

    /**
     * Sets the part's data size in bytes. The minimal size for a part is 5MB
     * except the last part.
     *
     * @param partSize
     *            Part's data size in bytes.
     */
    public void setPartSize(Long partSize) {
        this.partSize = partSize;
    }

    /**
     * Gets the part data's MD5 value.
     *
     * @return The part data's MD5 value.
     */
    public String getMd5Digest() {
        return md5Digest;
    }

    /**
     * Sets the part data's MD5 value.
     *
     * @param md5Digest
     *            The part data's MD5 value.
     */
    public void setMd5Digest(String md5Digest) {
        this.md5Digest = md5Digest;
    }

    public String getSourceBucketName() {
        return sourceBucketName;
    }

    public void setSourceBucketName(String sourceBucketName) {
        this.sourceBucketName = sourceBucketName;
    }

    public String getSourceKey() {
        return sourceKey;
    }

    public void setSourceKey(String sourceKey) {
        this.sourceKey = sourceKey;
    }

    /**
     * <p>
     * Gets the version ID specifying which version of the source object to
     * copy. If not specified, the most recent version of the source object will
     * be copied.
     * </p>
     * <p>
     * Objects created before enabling versioning or when versioning is
     * suspended are given the default <code>null</code> version ID (see
     * {@link com.heredata.hos.internal.HOSConstants#NULL_VERSION_ID}). Note that the <code>null</code>
     * version ID is a valid version ID and is not the same as not having a
     * version ID.
     * </p>
     * <p>
     * For more information about enabling versioning for a bucket, see
     * {@link NCHOS#setBucketVersioning(SetBucketVersioningRequest)}.
     * </p>
     *
     * @return The version ID specifying which version of the source object to
     *         copy.
     *
     * @see com.heredata.hos.internal.HOSConstants#NULL_VERSION_ID
     */
    public String getSourceVersionId() {
        return sourceVersionId;
    }

    /**
     * <p>
     * Sets the optional version ID specifying which version of the source
     * object to copy. If not specified, the most recent version of the source
     * object will be copied.
     * </p>
     * <p>
     * Objects created before enabling versioning or when versioning is
     * suspended are given the default <code>null</code> version ID (see
     * {@link com.heredata.hos.internal.HOSConstants#NULL_VERSION_ID}). Note that the <code>null</code>
     * version ID is a valid version ID and is not the same as not having a
     * version ID.
     * </p>
     * <p>
     * For more information about enabling versioning for a bucket, see
     * </p>
     *
     * @param sourceVersionId
     *            The optional version ID specifying which version of the source
     *            object to copy.
     */
    public void setSourceVersionId(String sourceVersionId) {
        this.sourceVersionId = sourceVersionId;
    }

    public Long getBeginIndex() {
        return beginIndex;
    }

    public void setBeginIndex(Long beginIndex) {
        this.beginIndex = beginIndex;
    }

    public List<String> getMatchingETagConstraints() {
        return matchingETagConstraints;
    }

    public void setMatchingETagConstraints(List<String> matchingETagConstraints) {
        this.matchingETagConstraints.clear();
        if (matchingETagConstraints != null && !matchingETagConstraints.isEmpty()) {
            this.matchingETagConstraints.addAll(matchingETagConstraints);
        }
    }

    public void clearMatchingETagConstraints() {
        this.matchingETagConstraints.clear();
    }

    public List<String> getNonmatchingEtagConstraints() {
        return nonmatchingEtagConstraints;
    }

    public void setNonmatchingETagConstraints(List<String> nonmatchingEtagConstraints) {
        this.nonmatchingEtagConstraints.clear();
        if (nonmatchingEtagConstraints != null && !nonmatchingEtagConstraints.isEmpty()) {
            this.nonmatchingEtagConstraints.addAll(nonmatchingEtagConstraints);
        }
    }

    public void clearNonmatchingETagConstraints() {
        this.nonmatchingEtagConstraints.clear();
    }

    public Date getUnmodifiedSinceConstraint() {
        return unmodifiedSinceConstraint;
    }

    public void setUnmodifiedSinceConstraint(Date unmodifiedSinceConstraint) {
        this.unmodifiedSinceConstraint = unmodifiedSinceConstraint;
    }

    public Date getModifiedSinceConstraint() {
        return modifiedSinceConstraint;
    }

    public void setModifiedSinceConstraint(Date modifiedSinceConstraint) {
        this.modifiedSinceConstraint = modifiedSinceConstraint;
    }
}
