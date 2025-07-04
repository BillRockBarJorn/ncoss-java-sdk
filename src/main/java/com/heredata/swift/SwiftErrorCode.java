package com.heredata.swift;

/**
 * <p>Title: HOSErrorCode</p>
 * <p>Description: HOS服务器错误码 </p>
 * <p>Copyright: Copyright (c) 2022</p>
 * <p>Company: Here-Data </p>
 * @author wuzz
 * @version 1.0.0
 * @createtime 2022/10/27 13:45
 */
public interface SwiftErrorCode {

    /**
     * Access Denied (401)
     */
    static final String ACCESS_DENIED = "AccessDenied";

    /**
     * Access Forbidden (403)
     */
    static final String ACCESS_FORBIDDEN = "AccessForbidden";

    /**
     * Bucket pre-exists
     */
    static final String BUCKET_ALREADY_EXISTS = "BucketAlreadyExists";

    /**
     * Bucket not empty.
     */
    static final String BUCKET_NOT_EMPTY = "BucketNotEmpty";

    /**
     * File groups is too large.
     */
    static final String FILE_GROUP_TOO_LARGE = "FileGroupTooLarge";

    /**
     * File part is stale.
     */
    static final String FILE_PART_STALE = "FilePartStale";

    /**
     * Invalid argument.
     */
    static final String INVALID_ARGUMENT = "InvalidArgument";

    /**
     * Non-existing Access ID
     */
    static final String INVALID_ACCESS_KEY_ID = "InvalidAccessKeyId";

    /**
     * Invalid bucket name
     */
    static final String INVALID_BUCKET_NAME = "InvalidBucketName";

    /**
     * Invalid object name
     */
    static final String INVALID_OBJECT_NAME = "InvalidObjectName";

    /**
     * Invalid part
     */
    static final String INVALID_PART = "InvalidPart";

    /**
     * Invalid part order
     */
    static final String INVALID_PART_ORDER = "InvalidPartOrder";

    /**
     * The target bucket does not exist when setting logging.
     */
    static final String INVALID_TARGET_BUCKET_FOR_LOGGING = "InvalidTargetBucketForLogging";

    /**
     * HOS Internal error.
     */
    static final String INTERNAL_ERROR = "InternalError";

    /**
     * Missing content length.
     */
    static final String MISSING_CONTENT_LENGTH = "MissingContentLength";

    /**
     * Missing required argument.
     */
    static final String MISSING_ARGUMENT = "MissingArgument";

    /**
     * No bucket meets the requirement specified.
     */
    static final String NO_SUCH_BUCKET = "NoSuchBucket";

    /**
     * File does not exist.
     */
    static final String NO_SUCH_KEY = "NoSuchKey";

    /**
     * Version does not exist.
     */
    static final String NO_SUCH_VERSION = "NoSuchVersion";

    /**
     * Not implemented method.
     */
    static final String NOT_IMPLEMENTED = "NotImplemented";

    /**
     * Error occurred in precondition.
     */
    static final String PRECONDITION_FAILED = "PreconditionFailed";

    /**
     * 304 Not Modified。
     */
    static final String NOT_MODIFIED = "NotModified";

    /**
     * Invalid location.
     */
    static final String INVALID_LOCATION_CONSTRAINT = "InvalidLocationConstraint";

    /**
     * The specified location does not match with the request.
     */
    static final String ILLEGAL_LOCATION_CONSTRAINT_EXCEPTION = "IllegalLocationConstraintException";

    /**
     * The time skew between the time in request headers and server is more than
     * 15 min.
     */
    static final String REQUEST_TIME_TOO_SKEWED = "RequestTimeTooSkewed";

    /**
     * Request times out.
     */
    static final String REQUEST_TIMEOUT = "RequestTimeout";

    /**
     * Invalid signature.
     */
    static final String SIGNATURE_DOES_NOT_MATCH = "SignatureDoesNotMatch";

    /**
     * Too many buckets under a user.
     */
    static final String TOO_MANY_BUCKETS = "TooManyBuckets";

    /**
     * Source buckets is not configured with CORS.
     */
    static final String NO_SUCH_CORS_CONFIGURATION = "NoSuchCORSConfiguration";

    /**
     * The source bucket is not configured with static website (the index page
     * is null).
     */
    static final String NO_SUCH_WEBSITE_CONFIGURATION = "NoSuchWebsiteConfiguration";

    /**
     * The source bucket is not configured with lifecycle rule.
     */
    static final String NO_SUCH_LIFECYCLE = "NoSuchLifecycle";

    /**
     * Malformed xml.
     */
    static final String MALFORMED_XML = "MalformedXML";

    /**
     * Invalid encryption algorithm error.
     */
    static final String INVALID_ENCRYPTION_ALGORITHM_ERROR = "InvalidEncryptionAlgorithmError";

    /**
     * The upload Id does not exist.
     */
    static final String NO_SUCH_UPLOAD = "NoSuchUpload";

    /**
     * The entity is too small. (Part must be more than 100K)
     */
    static final String ENTITY_TOO_SMALL = "EntityTooSmall";

    /**
     * The entity is too big.
     */
    static final String ENTITY_TOO_LARGE = "EntityTooLarge";

    /**
     * Invalid MD5 digest.
     */
    static final String INVALID_DIGEST = "InvalidDigest";

    /**
     * Invalid range of the character.
     */
    static final String INVALID_RANGE = "InvalidRange";

    /**
     * Security token is not supported.
     */
    static final String SECURITY_TOKEN_NOT_SUPPORTED = "SecurityTokenNotSupported";

    /**
     * The specified object does not support append operation.
     */
    static final String OBJECT_NOT_APPENDALBE = "ObjectNotAppendable";

    /**
     * The position of append on the object is not same as the current length.
     */
    static final String POSITION_NOT_EQUAL_TO_LENGTH = "PositionNotEqualToLength";

    /**
     * Invalid response.
     */
    static final String INVALID_RESPONSE = "InvalidResponse";

    /**
     * Callback failed. The operation (such as download or upload) succeeded
     * though.
     */
    static final String CALLBACK_FAILED = "CallbackFailed";

    /**
     * The Live Channel does not exist.
     */
    static final String NO_SUCH_LIVE_CHANNEL = "NoSuchLiveChannel";

    /**
     * symlink target file does not exist.
     */
    static final String NO_SUCH_SYM_LINK_TARGET = "SymlinkTargetNotExist";

    /**
     * The archive file is not restored before usage.
     */
    static final String INVALID_OBJECT_STATE = "InvalidObjectState";

    /**
     * The policy text is illegal.
     */
    static final String INVALID_POLICY_DOCUMENT = "InvalidPolicyDocument";

    /**
     * The exsiting bucket without policy.
     */
    static final String NO_SUCH_BUCKET_POLICY = "NoSuchBucketPolicy";

    /**
     * The object has already exists.
     */
    static final String OBJECT_ALREADY_EXISTS = "ObjectAlreadyExists";

    /**
     * The exsiting bucket without inventory.
     */
    static final String NO_SUCH_INVENTORY = "NoSuchInventory";

    /**
     * The part is not upload sequentially
     */
    static final String PART_NOT_SEQUENTIAL = "PartNotSequential";

    /**
     * The file is immutable.
     */
    static final String FILE_IMMUTABLE = "FileImmutable";

    /**
     * The worm configuration is locked.
     */
    static final String WORM_CONFIGURATION_LOCKED = "WORMConfigurationLocked";

    /**
     * The worm configuration is invalid.
     */
    static final String INVALID_WORM_CONFIGURATION = "InvalidWORMConfiguration";

    /**
     * The file already exists.
     */
    static final String FILE_ALREADY_EXISTS = "FileAlreadyExists";

}
